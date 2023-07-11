SUMMARY = "A graphical network simulator"
DESCRIPTION = "The GNS3 server manages emulators such as Dynamips, VirtualBox or Qemu/KVM. \
Clients like the GNS3 GUI controls the server using a JSON-RPC API over Websockets. \
 \
You will need the new GNS3 GUI (gns3-gui repository) to control the server."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.38"

RPM_NAME = "gns3-server-2.2.38-1.2.noarch.rpm"
RPM_HASH = "0863b9397f48775acdf92a6b624f2f7554616cb53a2a2311ac2041f6033c905db038005dd32a04e3ea5ebbb17e0b6d8b192ff0aa69635aaa929e55c65ba519c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gns3-server \
python3.11dist-gns3-server \
python3dist-gns3-server"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
/usr/bin/sh \
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
