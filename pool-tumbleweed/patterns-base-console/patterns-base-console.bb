SUMMARY = "Console Tools"
DESCRIPTION = "Applications useful for those using the console and no graphical desktop environment."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-console-20200505-41.1.aarch64.rpm"
RPM_HASH = "ffcfef42e1bc71d2f1a4848adf20252a7e9280326ab3b3a57335ac874b223ab2cde9a07b67712ff55d7b8d1971f472fad7d55babecd0e557baf5e8ab59b2c66f"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-base-console \
patterns-base-console(aarch-64) \
patterns-openSUSE-console"

RDEPENDS:${PN} += "pattern()"

inherit rpm
