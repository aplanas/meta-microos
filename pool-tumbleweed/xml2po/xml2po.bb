SUMMARY = "Tool to extract translatable content from XML documents"
DESCRIPTION = "xml2po is a Python program which extracts translatable content from \
free-form XML documents and outputs gettext compatible POT files."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.10"

RPM_NAME = "xml2po-0.20.10-21.5.noarch.rpm"
RPM_HASH = "5167dc27e25d43f2af8892a06f8ddd73f0d4e8a645d533f6317a2a207729ac7ec2b4ef4f8b8371cdaf2def632a9931549b7727b685475154e4af9ea53839076d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml2po"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
