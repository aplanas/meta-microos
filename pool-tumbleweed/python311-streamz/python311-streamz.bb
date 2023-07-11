SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python311-streamz-0.6.4-2.5.noarch.rpm"
RPM_HASH = "14a3e186b9ce0228ca3971598756d2b71298f34ed906c40d5aa7330e411a0a4fec362f35e954eb223a989903926f8cc2ffe11c496c2874ce8b00b51d4523184c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-streamz \
python3.11dist-streamz \
python311-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python311-setuptools \
python311-six \
python311-toolz \
python311-tornado \
python311-zict"

inherit rpm
