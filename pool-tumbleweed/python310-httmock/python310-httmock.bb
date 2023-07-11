SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python310-httmock-1.4.0-1.13.noarch.rpm"
RPM_HASH = "028071c533e4184bb202b7db5332a63c11aac0f03e7fbf9adb4253c210a9fc28eddb0bab8f0b25681f881aebc091d3627356c140a2668aa3ec4101b8e091655c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httmock \
python310-httmock \
python3dist-httmock"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
