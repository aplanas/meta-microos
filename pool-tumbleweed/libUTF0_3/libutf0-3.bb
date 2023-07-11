SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libUTF0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "184bdbc62f9939d2fdc639be90453aabd5d900aecf0364cf234f3a2a703313efc1b4d546f07b3810ba130dd738adb5cd8b3719d3332929347f742ddbd2de8156"

RPROVIDES:${PN} += "libUTF.so.0.3 \
libUTF0-3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
