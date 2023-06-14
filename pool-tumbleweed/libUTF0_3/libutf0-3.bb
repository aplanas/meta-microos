SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libUTF0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "177d0b9ee40689f8933269f59180d48ccd0722c517e98c7ee1813ecda3476907a89351c6987c31a3b925fadea2c6cabdb1752ed6b0766c4a81d319bdc20a737f"

RPROVIDES:${PN} += "libUTF.so.0.3 \
libUTF0-3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
