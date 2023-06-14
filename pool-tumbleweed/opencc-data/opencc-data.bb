SUMMARY = "Dictionaries for Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides dictionaries and patterns used by libraries/ \
binaries of OpenCC."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "opencc-data-1.1.6-1.3.aarch64.rpm"
RPM_HASH = "6f7d5a8b215b84725d459fde31452148a432adae416057c593332f7b60d8ba79f79a2959fb67e77c4cb9c6d2f273952f9ab16dd35b7a358df87e5c23a14dd6c4"

RPROVIDES:${PN} += "opencc-data"

RDEPENDS:${PN} += ""

inherit rpm
