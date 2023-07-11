SUMMARY = "Dictionaries for Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides dictionaries and patterns used by libraries/ \
binaries of OpenCC."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "opencc-data-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "0feec08e75563f0bd8de39ef548c79146d970821c772c1e7917a593790ff0f11b4a8901e8c93314b4e504b6def31124eef4025b5de4b4b67f777ce7c72641cbf"

RPROVIDES:${PN} += "opencc-data"

RDEPENDS:${PN} += ""

inherit rpm
