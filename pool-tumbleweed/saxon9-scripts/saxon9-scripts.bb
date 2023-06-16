SUMMARY = "Utility scripts for saxon9"
DESCRIPTION = "Utility scripts for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-scripts-9.4.0.7-16.6.noarch.rpm"
RPM_HASH = "db3b5be3943c455722fd3eeece0a0fc387d5126166fdf2b5f7c04d52d7200d9a075112b32b8bb533855ee96934669b815b1b773894a05df855cb0ed04660d430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
jaxp-parser-impl \
saxon9 \
xml-commons-apis"

inherit rpm
