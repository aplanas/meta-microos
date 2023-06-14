SUMMARY = "Universal encoding detector"
DESCRIPTION = "Universal character encoding detector \
------------------------------------- \
 \
Detects \
 - ASCII, UTF-8, UTF-16 (2 variants), UTF-32 (4 variants) \
 - Big5, GB2312, EUC-TW, HZ-GB-2312, ISO-2022-CN (Traditional and Simplified Chinese) \
 - EUC-JP, SHIFT_JIS, ISO-2022-JP (Japanese) \
 - EUC-KR, ISO-2022-KR (Korean) \
 - KOI8-R, MacCyrillic, IBM855, IBM866, ISO-8859-5, windows-1251 (Cyrillic) \
 - ISO-8859-2, windows-1250 (Hungarian) \
 - ISO-8859-5, windows-1251 (Bulgarian) \
 - windows-1252 (English) \
 - ISO-8859-7, windows-1253 (Greek) \
 - ISO-8859-8, windows-1255 (Visual and Logical Hebrew) \
 - TIS-620 (Thai) \
 \
Requires Python 2.1 or later \
 \
Command-line Tool \
----------------- \
 \
chardet comes with a command-line script which reports on the encodings of one \
or more files:: \
 \
    % chardetect.py somefile someotherfile \
    somefile: windows-1252 with confidence 0.5 \
    someotherfile: ascii with confidence 1.0"
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "python310-chardet-5.1.0-3.1.noarch.rpm"
RPM_HASH = "93eaa73bebb98076b5016ef329065bbc7dbc8e192813004b0ed61818f262dcb173ae5c4b0d288a0d0db55bed4ab264c8a77ab4dbae295c58d1766c61c8f2a4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chardet \
python3.10dist-chardet \
python310-chardet \
python3dist-chardet"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python-abi"

inherit rpm
