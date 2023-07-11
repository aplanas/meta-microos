SUMMARY = "Development files for python39-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python39-editdistance C module."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-editdistance-devel-0.6.2-1.6.aarch64.rpm"
RPM_HASH = "c583e17d2252a3d64f46483cd9b1edbde13a2bea4109c4a8404f0985814e443ba82a669580398e8bf0116a66eda0a66d06f0589dcdc3c9fe6bf8d5167b3071f8"

RPROVIDES:${PN} += "python39-editdistance-devel"

RDEPENDS:${PN} += "python39-base \
python39-editdistance"

inherit rpm
