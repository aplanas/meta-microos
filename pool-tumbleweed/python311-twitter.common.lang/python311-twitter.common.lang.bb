SUMMARY = "Python language and compatibility facilities"
DESCRIPTION = "twitter.commonn.lang is a Python library for language and compatibility \
facilities. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python311-twitter.common.lang-0.3.11-1.16.aarch64.rpm"
RPM_HASH = "668a98c6d31fd5b2f72f80fe266619b4e1ad846810a0a143550bd04b607cdf16028177206d07f8704a29ff0e894103ca168f57ce314f2df43d782dd26d418aff"

RPROVIDES:${PN} += "python3-twitter.common.lang \
python3.11dist-twitter.common.lang \
python311-twitter.common.lang \
python3dist-twitter.common.lang"

RDEPENDS:${PN} += "python-abi"

inherit rpm
