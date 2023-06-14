SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python310-linstor-client-1.12.0-1.10.aarch64.rpm"
RPM_HASH = "c171bb2bfe9c559f452b2734fa1e1cca13d1bca7189a1574b2483fd998d9d7bbb75c557e79c742e7792b29d26cdf85875e4c8329f2fe61f557206ddc876dd6e9"

RPROVIDES:${PN} += "python3-linstor-client \
python3.10dist-linstor-client \
python310-linstor-client \
python3dist-linstor-client"

RDEPENDS:${PN} += "python-abi \
python310-linstor"

inherit rpm
