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

RPM_NAME = "python311-dfVFS-0~20221224-3.1.noarch.rpm"
RPM_HASH = "2de94627b4a621dbf3266cc8a5b182a871390f98c343a2811dcf6c9148d9864ee2004ef06b79660c660803fa142718c69494c03a47169711af2b72d9025572ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfVFS \
python3.11dist-dfvfs \
python311-dfVFS \
python3dist-dfvfs"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-construct \
python311-cryptography \
python311-dfdatetime \
python311-dtfabric \
python311-libbde \
python311-libcaes \
python311-libewf \
python311-libfsapfs \
python311-libfsext \
python311-libfsfat \
python311-libfshfs \
python311-libfsntfs \
python311-libfsxfs \
python311-libfvde \
python311-libfwnt \
python311-libluksde \
python311-libmodi \
python311-libphdi \
python311-libqcow \
python311-libsigscan \
python311-libsmdev \
python311-libsmraw \
python311-libvhdi \
python311-libvmdk \
python311-libvsgpt \
python311-libvshadow \
python311-libvslvm \
python311-tsk"

inherit rpm
