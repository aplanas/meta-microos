SUMMARY = "Vagrantfile syntax files for the vim editor"
DESCRIPTION = "Optional dependency offering vim syntax files for Vagrantfile"
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "vagrant-vim-2.3.7-1.1.noarch.rpm"
RPM_HASH = "bc7d507f24dbd2e365c131f3bb9331c5f07129035b381fe3666e9c400cdc4c5ea77e84008bbe2042e5bbf3b02b20c302c71051bef9feadcbb08611a27852fa4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-vim"

RDEPENDS:${PN} += "vagrant \
vim"

inherit rpm
