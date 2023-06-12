SUMMARY = "Fish completion for khal"
DESCRIPTION = "Fish shell completions for khal"
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python-khal-fish-completion-0.10.5-3.4.noarch.rpm"
RPM_HASH = "755ba27b3ec716aa55130993f9eae961f20d42dd6380f030bb6022f6911beac0bbe74cedc279fa490121d495bdf89ca5b41b8049c8e3c7b86c956e6a561b7211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
