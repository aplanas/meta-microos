SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python311-streamz-0.6.4-2.3.noarch.rpm"
RPM_HASH = "2158041e650ef0da83012262861647208ed80f34608b0b4c80f7403c28312f5f2f1fe41fd98744c3126d074f3bea90771ec0b8fa1d0d9d3083790bd629e1f6cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(streamz) \
python311-streamz \
python3dist(streamz)"
RDEPENDS:${PN} += "python(abi) \
python311-setuptools \
python311-six \
python311-toolz \
python311-tornado \
python311-zict"

inherit rpm
