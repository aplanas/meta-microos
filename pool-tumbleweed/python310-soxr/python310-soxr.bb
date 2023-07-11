SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.5"

RPM_NAME = "python310-soxr-0.3.5-1.3.aarch64.rpm"
RPM_HASH = "2baff30a9a4dea13bab7c47ad4f3c4aecd4b0ca42aaf389f1a2042deec01ce088ad2eb3f0136c9f300a13622e3b11335e25cc52dace789293c66cbd03e9595db"

RPROVIDES:${PN} += "python3.10dist-soxr \
python310-soxr \
python3dist-soxr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsoxr.so.0 \
python-abi \
python310-numpy"

inherit rpm
