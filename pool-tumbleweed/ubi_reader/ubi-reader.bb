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

RPM_NAME = "ubi_reader-0.8.5-1.3.noarch.rpm"
RPM_HASH = "d05e8ab952759cb8ed29294ea4129c3a0cf23d82f084d306ccb5c1e143d32f7c5a6d896bc0dd0e9c2af9510596319fb31acfff81ef65d3260e54cfadd3fd48d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ubi-reader \
python3dist-ubi-reader \
ubi-reader"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-python-lzo"

inherit rpm
