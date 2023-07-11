SUMMARY = "Library for Intel HEX Files Manipulations"
DESCRIPTION = "Python implementation of Intel HEX file format allows you read, modify, write \
hex files and convert them to binary form. \
 \
The Intel HEX file format widely used in microprocessors and microcontrollers \
area as the de-facto standard for representation of code for programming \
microelectronic devices. \
 \
This work implements an **intelhex** Python library to read, write, \
create from scratch and manipulate data from HEX (also known as Intel HEX) \
file format. These operations are provided by “IntelHex” class. \
 \
The distribution package also includes several convenience Python scripts \
to do basic tasks that utilize this library. The “bin2hex.py” script \
converts binary data to HEX, and the “hex2bin.py” works the other direction. \
“hex2dump.py” converts data from HEX to a hexdump which is useful for \
inspecting data, and “hexmerge.py” merges multiple HEX files into one."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "intelhex-2.3.0-1.4.noarch.rpm"
RPM_HASH = "2ac7e4a9cd7cae9b9232952cd6ba89a18af76c16be970179ad0c52745c6bdf0dcecd451fd5e9d86035d231da8cfeb592e99460a0f78a45353af0f193afc158cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intelhex \
python3.11dist-intelhex \
python3dist-intelhex"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
