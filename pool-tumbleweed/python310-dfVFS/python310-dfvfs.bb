SUMMARY = "Digital Forensics Virtual File System"
DESCRIPTION = "dfVFS, or Digital Forensics Virtual File System, provides read-only \
access to file-system objects from various storage media types and file \
formats. The goal of dfVFS is to provide a generic interface for \
accessing file-system objects, for which it uses several back-ends that \
provide the actual implementation of the various storage media types, \
volume systems and file systems. \
 \
dfVFS originates from the Plaso project and is also based on ideas from \
the GRR project. It was largely rewritten and made into a stand-alone \
project to provide more flexibility and allow other projects to make use \
of the VFS functionality. dfVFS originally was named PyVFS, but that \
name conflicted with another project. \
 \
dfVFS is currently implemented as a Python module."
LICENSE = "Apache-2.0"

PV = "0~20221224"

RPM_NAME = "python310-dfVFS-0~20221224-3.1.noarch.rpm"
RPM_HASH = "9526e73ff3f645a6e6e37f61ccc9e6de74737d7997cde6587fee0e02aa48af56246e11f8ae61748314c5789b51775977bc6d3af3d6d37628f7cd764f8d43e037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dfvfs \
python310-dfVFS \
python3dist-dfvfs"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-construct \
python310-cryptography \
python310-dfdatetime \
python310-dtfabric \
python310-libbde \
python310-libcaes \
python310-libewf \
python310-libfsapfs \
python310-libfsext \
python310-libfsfat \
python310-libfshfs \
python310-libfsntfs \
python310-libfsxfs \
python310-libfvde \
python310-libfwnt \
python310-libluksde \
python310-libmodi \
python310-libphdi \
python310-libqcow \
python310-libsigscan \
python310-libsmdev \
python310-libsmraw \
python310-libvhdi \
python310-libvmdk \
python310-libvsgpt \
python310-libvshadow \
python310-libvslvm \
python310-tsk"

inherit rpm
