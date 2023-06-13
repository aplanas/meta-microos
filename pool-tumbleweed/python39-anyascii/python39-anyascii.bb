SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.2"

RPM_NAME = "python39-anyascii-0.3.2-1.1.noarch.rpm"
RPM_HASH = "3e3be71b5185ed32d775fcabe0a8c7b7300e84a9051a3ba10b13d0901cf81853ffd418c02bd4f8ee6ddbce2512659d31ec73823502a46bda040cc2fb13e5bfdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(anyascii) \
python39-anyascii \
python3dist(anyascii)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
