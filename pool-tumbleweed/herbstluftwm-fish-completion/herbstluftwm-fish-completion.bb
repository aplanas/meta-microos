SUMMARY = "Fish completion for herbstluftwm"
DESCRIPTION = "Fish completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-fish-completion-0.9.5-1.4.noarch.rpm"
RPM_HASH = "14dc3ce4af6d59f5a71c84336264977fe0f0f176814d92e272dc1e6a1de0ae65f1a6aaea7f2986c5b40f03ea75bb63a005d644787e280df15792134909a432da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-fish-completion"

RDEPENDS:${PN} += "herbstluftwm"

inherit rpm
