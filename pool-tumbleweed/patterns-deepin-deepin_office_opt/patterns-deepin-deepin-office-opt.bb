SUMMARY = "Deepin Office"
DESCRIPTION = "Deepin Office"
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin_office_opt-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "5bb59e6fde5d4e463ec968a107a35da41c6219cc953d48e6f3b1d6d8afc34fb37e0e9b0dafa7f98985d02e28eaa4a7c1bdd9b62048f9e99f6beeac51c13f74d8"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-deepin-deepin_office_opt \
patterns-deepin-deepin_office_opt(aarch-64)"

RDEPENDS:${PN} += "pattern()"

inherit rpm
