SUMMARY = "Python language and compatibility facilities"
DESCRIPTION = "twitter.commonn.lang is a Python library for language and compatibility \
facilities. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python310-twitter.common.lang-0.3.11-1.15.aarch64.rpm"
RPM_HASH = "1f1063e9c5051668e55149f969ccdcc931de5a4205b3995dddead14bf3ec909a595e94a7823a581860a0172b21bb44cdc12d535421b6b3726f192527c366926c"

RPROVIDES:${PN} += "python3-twitter.common.lang \
python3.10dist(twitter.common.lang) \
python310-twitter.common.lang \
python310-twitter.common.lang(aarch-64) \
python3dist(twitter.common.lang)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
