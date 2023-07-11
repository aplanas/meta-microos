SUMMARY = "Library That Implements Different Microsoft Compressions"
DESCRIPTION = "The purpose of libmspack is to provide both compression and \
decompression of some loosely related file formats used by Microsoft. \
Currently the most common formats are implemented. \
 \
This subpacke provides useful programs that make use of libmspack. \
 * cabd_memory - An implementation of the mspack_system interface using \
                 only memory \
 * cabrip      - Extracts any CAB files embedded in another file. \
 * chmextract  - Extracts all files in a CHM file to disk. \
 * msexpand    - Expands an SZDD or KWAJ file. \
 * multifh     - An implementation of the mspack_system interface which \
                 can access many things: regular disk files, already \
                 opened stdio FILE*  file pointers, open file \
                 descriptors, blocks of memory \
 * oabextract  - Extracts an Exchange Offline Address Book (.LZX) file."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "mspack-examples-0.11-1.4.aarch64.rpm"
RPM_HASH = "7c19dec66ebeff544bc5800c88137326cb64bdbb707852fe5f4ec4911283d2c064f87fc21c4c4f14a01d54be5debfabb504c4e21fd41ad6a1156720757688789"

RPROVIDES:${PN} += "mspack-examples \
mspack-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmspack.so.0"

inherit rpm
