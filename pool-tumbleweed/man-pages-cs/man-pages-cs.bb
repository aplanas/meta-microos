SUMMARY = "Translation of man pages in Czech"
DESCRIPTION = "This package provides translations of man pages in Czech."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-cs-4.20.0-1.1.noarch.rpm"
RPM_HASH = "ed1f4d9e281cf00c9465262a03fe0ab1c207fd1c9f3ce02f153d641560dc2502d8ec143eb626a316861c7a976bdc7ff44fe5115264b9697c967159a1e77ce7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-cs \
man-pages-cs"

RDEPENDS:${PN} += "man-pages"

inherit rpm
