SUMMARY = "En-/decode OpenTTD sound replacement files"
DESCRIPTION = "catcodec decodes and encodes sample catalogues for OpenTTD. These sample \
catalogues are not much more than some meta-data (description and file name) \
and raw PCM data. \
 \
catcodec is licensed under the GNU General Public License version 2.0. For \
more information, see the file 'COPYING'."
LICENSE = "GPL-2.0"

PV = "1.0.5"

RPM_NAME = "catcodec-1.0.5-7.25.aarch64.rpm"
RPM_HASH = "407ce1f9c54806f736a7183dbd0286b27a5dfd0c54144cf00dfa95f3ad015bd9f22416e00b63820842797513e164def4b55db14184954df51e09a907edebf749"

RPROVIDES:${PN} += "catcodec"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
