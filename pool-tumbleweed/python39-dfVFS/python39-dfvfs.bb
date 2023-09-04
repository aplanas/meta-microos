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

PV = "0~20230531"

RPM_NAME = "python39-dfVFS-0~20230531-1.1.noarch.rpm"
RPM_HASH = "7c1704a55b6f3d346a932d2c63e74a81ddafd80edf44cb5779aec9d01fd6c7f044dbf2c07c93d65560ef9d617fd8ffdeb6ee283005b663ee3d0c0e426b092c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dfvfs \
python39-dfVFS \
python3dist-dfvfs"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-construct \
python39-cryptography \
python39-dfdatetime \
python39-dtfabric \
python39-libbde \
python39-libcaes \
python39-libewf \
python39-libfsapfs \
python39-libfsext \
python39-libfsfat \
python39-libfshfs \
python39-libfsntfs \
python39-libfsxfs \
python39-libfvde \
python39-libfwnt \
python39-libluksde \
python39-libmodi \
python39-libphdi \
python39-libqcow \
python39-libsigscan \
python39-libsmdev \
python39-libsmraw \
python39-libvhdi \
python39-libvmdk \
python39-libvsapm \
python39-libvsgpt \
python39-libvshadow \
python39-libvslvm \
python39-tsk"

inherit rpm
