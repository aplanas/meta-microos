SUMMARY = "Python language and compatibility facilities"
DESCRIPTION = "twitter.commonn.lang is a Python library for language and compatibility \
facilities. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python311-twitter.common.lang-0.3.11-1.15.aarch64.rpm"
RPM_HASH = "0b90298996942d5734e6ae7ecb3f058246ab70b1cc0cc101b9efb1c00d17ee3272c8cf655062f4ca822a62b9d6c818f8a77e9668a9f9ef2536fd55c6bb11caff"

RPROVIDES:${PN} += "python3.11dist(twitter.common.lang) \
python311-twitter.common.lang \
python311-twitter.common.lang(aarch-64) \
python3dist(twitter.common.lang)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
