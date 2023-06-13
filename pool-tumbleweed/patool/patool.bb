SUMMARY = "Portable Command Line Archive File Manager"
DESCRIPTION = "patool is a portable command line archive file manager. Various archive types \
can be created, extracted, tested and listed by patool. \
The advantage of patool is its simplicity in handling archive files without \
having to remember a myriad of programs and options. \
The archive format is determined by the file(1) program and as a fallback by \
the archive file extension. \
 \
patool supports 7z (.7z), ACE (.ace), ALZIP (.alz), AR (.a), ARC (.arc), ARJ \
(.arj), BZIP2 (.bz2), CAB (.cab), compress (.Z), CPIO (.cpio), DEB (.deb), GZIP \
(.gz), LRZIP (.lrz), LZH (.lha, .lzh), LZIP (.lz), LZMA (.lzma), LZOP (.lzo), \
RPM (.rpm), RAR (.rar), TAR (.tar), XZ (.xz), and ZIP (.zip, .jar) formats. \
 \
It relies on helper applications to handle those archive formats."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "patool-1.12-2.6.noarch.rpm"
RPM_HASH = "36f4f8a5ed0d61070477f1759ac7d12356ae25fe49b7738c2077a3072aee3aecee4283e4dfe9dada9004a847f879567f09ad40496a84a9e14134f6a49d8c6109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patool \
python3.10dist(patool) \
python3dist(patool)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
