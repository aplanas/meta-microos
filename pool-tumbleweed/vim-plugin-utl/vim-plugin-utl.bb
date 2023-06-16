SUMMARY = "Universal text linking for vim"
DESCRIPTION = "Universal text link allows you to set hyperlinks within your text documents. \
Hyperlinks can be used to start applications, open related documents, or \
bookmark parts of your text document."
LICENSE = "GPL-1.0-or-later"

PV = "2.0"

RPM_NAME = "vim-plugin-utl-2.0-55.1.noarch.rpm"
RPM_HASH = "8f536b2ad78bcdf5c5c46c9ad4a6b54b12064ff9a93a472bfccfc7e97cefc57e23296e9d84d1e12323c8e2a367c627a925a656259aca24a4f97001570092580b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-utl"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
