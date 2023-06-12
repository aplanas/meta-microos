SUMMARY = "Utility for creating Intel Automotive Service (IAS) images"
DESCRIPTION = "iasimage is a utility program for creating Intel Automotive Service (IAS) \
images, a binary file format understood by bootloaders to load and initialize \
Operating Systems or Hypervisors."
LICENSE = "BSD-3-Clause"

PV = "0.0.2+git20190410.7799ac7"

RPM_NAME = "iasimage-0.0.2+git20190410.7799ac7-1.9.noarch.rpm"
RPM_HASH = "378476a5bac4145936f0d6385a45afbf9f8ccc87c28356d3bc7e070ca393f30ecda72607aac3108e6a71f6a98c7975ad72923cadbb276227565af8741abda91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iasimage"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-cryptography"

inherit rpm
