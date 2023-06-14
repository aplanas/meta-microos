SUMMARY = "Extract files from UBI and UBIFS images"
DESCRIPTION = "Collection of Python scripts for reading information about and extracting \
data from UBI and UBIFS images. \
 \
The following tools are included: \
 - ubireader_display_info: \
   Show information about UBI or UBIFS image. \
 - ubireader_extract_files: \
   Extract contents of a UBI or UBIFS image. \
 - ubireader_extract_images: \
   Extract UBI or UBIFS images from file containing UBI data in it. \
 - ubireader_list_files: \
   List and Extract files of a UBI or UBIFS image. \
 - ubireader_utils_info: \
   Determine settings for recreating UBI image."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.5"

RPM_NAME = "ubi_reader-0.8.5-1.2.noarch.rpm"
RPM_HASH = "8904179dd514499b145250c87580fa2565b9f8ded97091ef32fd4a05de6e57dd567538527510a77d3ecb350e78f6b771bf87d7c2035070dc0927c1a01448ca1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ubi-reader \
python3dist-ubi-reader \
ubi-reader"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-python-lzo"

inherit rpm
