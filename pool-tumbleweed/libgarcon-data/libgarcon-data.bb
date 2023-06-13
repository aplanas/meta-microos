SUMMARY = "Data Files for garcon"
DESCRIPTION = "This package provides data files for garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.18.1"

RPM_NAME = "libgarcon-data-4.18.1-2.1.noarch.rpm"
RPM_HASH = "444cd853380195fc1f5d8bfd221f7a7588c6bf70ad28adc75aa599e6764c5d1bffd03a1dc73883841a51dd528a6c9d160f523faf76edd462f34aaebf02b95a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgarcon-data"

RDEPENDS:${PN} += "libgarcon-branding"

inherit rpm
