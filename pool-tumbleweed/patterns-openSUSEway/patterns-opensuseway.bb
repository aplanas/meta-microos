SUMMARY = "The openSUSEway desktop environment pattern"
DESCRIPTION = "This pattern installs the openSUSE look and feel for sway."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "patterns-openSUSEway-0.15.2-1.1.noarch.rpm"
RPM_HASH = "fb010bb334ac215a16939eec2646c34ce5f52301143b82594336cb441d57e968358d7c38681b0dcb007634972e3e230bc542a1d8780d0b390d24ed8bbb1e1f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-openSUSEway"
RDEPENDS:${PN} += "openSUSEway"

inherit rpm
