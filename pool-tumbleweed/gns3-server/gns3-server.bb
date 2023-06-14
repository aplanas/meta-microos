SUMMARY = "A graphical network simulator"
DESCRIPTION = "The GNS3 server manages emulators such as Dynamips, VirtualBox or Qemu/KVM. \
Clients like the GNS3 GUI controls the server using a JSON-RPC API over Websockets. \
 \
You will need the new GNS3 GUI (gns3-gui repository) to control the server."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.38"

RPM_NAME = "gns3-server-2.2.38-1.1.noarch.rpm"
RPM_HASH = "4b8bbc960bc40f9d3de30226dc18fdbac09dc3f47dfdc5f0c05020b6e4e5cab43ee711df0356900498590c7e945870d7663d31d9b64bf6c6c43722e40abc6853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gns3-server \
python3.10dist-gns3-server \
python3dist-gns3-server"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/python3.10 \
busybox \
cpulimit \
docker \
dynamips \
iouyap \
python-abi \
python3-Jinja2 \
python3-aiofiles \
python3-aiohttp \
python3-aiohttp-cors \
python3-async-timeout \
python3-distro \
python3-jsonschema \
python3-psutil \
python3-py-cpuinfo \
python3-sentry-sdk \
qemu \
shadow \
ubridge \
vpcs \
wireshark"

inherit rpm
