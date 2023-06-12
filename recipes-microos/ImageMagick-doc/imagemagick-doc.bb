SUMMARY = "Document Files for ImageMagick Library"
DESCRIPTION = "HTML documentation for ImageMagick library and scene examples."
LICENSE = "ImageMagick"

PV = "7.1.1.11"

RPM_NAME = "ImageMagick-doc-7.1.1.11-1.1.noarch.rpm"
RPM_HASH = "cd628770c61375dd5bb7f8eba0eee11abc90fef1d3307333394e1252277c1ef0871f277f9ec4a8be912d6ae1bd5fe18acc9522e41ac4dbe02a362e90338760f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-doc"
RDEPENDS:${PN} += ""

inherit rpm
