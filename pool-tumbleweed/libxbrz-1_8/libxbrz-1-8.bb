SUMMARY = "Pattern recognition rule-based bitmap upscaler"
DESCRIPTION = "The idea of xBR is to scale bitmaps using pattern recognition (like \
HQx), but also uses a 2-stage set of interpolation rules, which \
better handle more complex patterns such as antialiased lines and \
curves. Background textures keep the sharp characteristics of the \
original image rather than becoming blurry like with HQx. \
 \
xBRZ follows this idea, but has a different set of rules, focusing on \
preserving small image features consisting of few pixels only, like \
commonly used in faces."
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "libxbrz-1_8-1.8-2.4.aarch64.rpm"
RPM_HASH = "c68d1af08b8916355632629b45a698920d7f6da7498931a37a4513ad8150f6c030c50b8e8378e624d8071b13c71c372061ae9e63670e90bf7c74d0823df40550"

RPROVIDES:${PN} += "libxbrz-1-8 \
libxbrz-1.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
