SUMMARY = "Python language and compatibility facilities"
DESCRIPTION = "twitter.commonn.lang is a Python library for language and compatibility \
facilities. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python310-twitter.common.lang-0.3.11-1.16.aarch64.rpm"
RPM_HASH = "eb702fd213c781aca8ccc56becc5e7e87a30ad9c0b17728ffa1bc857b0dc08c035ae85475471df0fb0cf5340a8a77bbcad96a37076655cdeef2ec0a3a4062bed"

RPROVIDES:${PN} += "python3.10dist-twitter.common.lang \
python310-twitter.common.lang \
python3dist-twitter.common.lang"

RDEPENDS:${PN} += "python-abi"

inherit rpm
