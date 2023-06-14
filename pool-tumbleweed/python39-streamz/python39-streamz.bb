SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python39-streamz-0.6.4-2.3.noarch.rpm"
RPM_HASH = "22292c11eb74efbd7f54c62faabf60df6eb0ab170c82857165a2e8048e2f2e10eaa73c5d1e11727d374127cdbb93d835ae0b7234314fc453eb823fe69d9dc251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-streamz \
python39-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python39-setuptools \
python39-six \
python39-toolz \
python39-tornado \
python39-zict"

inherit rpm
