SUMMARY = "Perl extension for hexdumping arbitrary data"
DESCRIPTION = "This module exports one subroutine: 'Hexify'. \
 \
'Hexify' formats arbitrary (possible binary) data into a format suitable \
for hex dumps in the style of 'xd' or 'hexl'. \
 \
The first, or only, argument to 'Hexify' contains the data, or a reference \
to the data, to be hexified. Hexify will return a string that prints as \
follows: \
 \
  0000: 70 61 63 6b 61 67 65 20 44 61 74 61 3a 3a 48 65  package Data::He \
  0010: 78 69 66 79 3b 0a 0a 75 73 65 20 35 2e 30 30 36  xify;..use 5.006 \
 \
and so on. At the left is the (hexadecimal) index of the data, then a \
number of hex bytes, followed by the chunk of data with unprintables \
replaced by periods. \
 \
The optional second argument to 'Hexify' must be a hash or a hash \
reference, containing values for any of the following parameters: \
 \
* first \
 \
  The first byte of the data to be processed. Default is to start from the \
  beginning of the data. \
 \
* length \
 \
  The number of bytes to be processed. Default is to proceed all data. \
 \
* chunk \
 \
  The number of bytes to be processed per line of output. Default is 16. \
 \
* group \
 \
  The number of bytes to be grouped together. Default is 1 (no grouping). \
  If used, it must be a divisor of the chunk size. \
 \
* duplicates \
 \
  When set, duplicate lines of output are suppressed and replaced by a \
  single line reading '**SAME**'. \
 \
  Duplicate suppression is enabled by default. \
 \
* showdata \
 \
  A reference to a subroutine that is used to produce a printable string \
  from a chunk of data. By default, a subroutine is used that replaces \
  unwanted bytes by periods. \
 \
  The subroutine gets the chunk of data passed as argument, and should \
  return a printable string of at most 'chunksize' characters. \
 \
* align \
 \
  Align the result to 'chunksize' bytes. This is relevant only when \
  processing data not from the beginning. For example, when 'first' is 10, \
  the result would become: \
 \
    0000:                ...    74 61 3a 3a 48 65            ta::He \
    0010: 78 69 66 79 3b ... 65 20 35 2e 30 30 36  xify;..use 5.006 \
    ... and so on ... \
 \
  Alignment is on by default. Without alignment, the result would be: \
 \
    000a: 74 61 3a 3a 48 ... 79 3b 0a 0a 75 73 65  ta::Hexify;..use \
    001a: 20 35 2e 30 30 ... 73 65 20 73 74 72 69   5.006;.use stri \
    ... and so on ... \
 \
* start \
 \
  Pretend that the data started at this byte (while in reality it starts at \
  byte 'first'). The above example, with 'start => 0', becomes: \
 \
    0000: 74 61 3a 3a 48 ... 79 3b 0a 0a 75 73 65  ta::Hexify;..use \
    0010: 20 35 2e 30 30 ... 73 65 20 73 74 72 69   5.006;.use stri \
    ... and so on ..."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.00"

RPM_NAME = "perl-Data-Hexify-1.00-15.26.noarch.rpm"
RPM_HASH = "3d7515d90c42b9bf7b1a10fb7dd2d3a1264ed15f771328013e47aee5dc0e92952731786a32b2e824184ee645003c749ed48a59a4fdf56a22dd77f5dc386ef404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Hexify) \
perl-Data-Hexify"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
