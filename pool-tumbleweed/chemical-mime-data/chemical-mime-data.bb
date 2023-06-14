SUMMARY = "A collection of data files for various chemical MIME types"
DESCRIPTION = "A collection of data files which tries to give support for various chemical \
MIME types (chemical/*) on Linux/UNIX desktops, such as KDE and GNOME. \
 \
Chemical MIMEs have been proposed in 1995, though it seems they have never \
been registered with IANA. However, they are widely used and the project's aim is, \
to support these important, but unofficial MIME types."
LICENSE = "LGPL-2.0-or-later"

PV = "0.1.94"

RPM_NAME = "chemical-mime-data-0.1.94-4.11.noarch.rpm"
RPM_HASH = "66539772f75548da695bcac01966a81d122b16d2d3e140512a5eb57a16528f66273377ca51ab852bf5150a93706b84f6aaffa7757b3f4b2d7e50ed933ca8be2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chemical-mime-data \
pkgconfig-chemical-mime-data"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hicolor-icon-theme \
pkgconfig-shared-mime-info \
shared-mime-info"

inherit rpm
