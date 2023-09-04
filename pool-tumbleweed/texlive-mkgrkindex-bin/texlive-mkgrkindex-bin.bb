SUMMARY = "Binary files of mkgrkindex"
DESCRIPTION = "Binary files of mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14428"

RPM_NAME = "texlive-mkgrkindex-bin-2023.20230311.svn14428-93.2.aarch64.rpm"
RPM_HASH = "94e72f63de92a68dbe2cf6d5319c08d4080acda5094847128f3ef726e49371c14e339301fae2c0bdd1b98b7c9555dfd879d29da3b8cb3eda1bf975ef4f8045cf"

RPROVIDES:${PN} += "texlive-mkgrkindex-bin"

RDEPENDS:${PN} += "texlive-mkgrkindex"

inherit rpm
