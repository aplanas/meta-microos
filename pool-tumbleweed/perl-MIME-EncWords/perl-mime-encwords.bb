SUMMARY = "deal with RFC 2047 encoded words (improved)"
DESCRIPTION = "Fellow Americans, you probably won't know what the hell this module is for. \
Europeans, Russians, et al, you probably do. ':-)'. \
 \
For example, here's a valid MIME header you might get: \
 \
      From: =?US-ASCII?Q?Keith_Moore?= <moore@cs.utk.edu> \
      To: =?ISO-8859-1?Q?Keld_J=F8rn_Simonsen?= <keld@dkuug.dk> \
      CC: =?ISO-8859-1?Q?Andr=E9_?= Pirard <PIRARD@vm1.ulg.ac.be> \
      Subject: =?ISO-8859-1?B?SWYgeW91IGNhbiByZWFkIHRoaXMgeW8=?= \
       =?ISO-8859-2?B?dSB1bmRlcnN0YW5kIHRoZSBleGFtcGxlLg==?= \
       =?US-ASCII?Q?.._cool!?= \
 \
The fields basically decode to (sorry, I can only approximate the Latin \
characters with 7 bit sequences /o and 'e): \
 \
      From: Keith Moore <moore@cs.utk.edu> \
      To: Keld J/orn Simonsen <keld@dkuug.dk> \
      CC: Andr'e  Pirard <PIRARD@vm1.ulg.ac.be> \
      Subject: If you can read this you understand the example... cool! \
 \
*Supplement*: Fellow Americans, Europeans, you probably won't know what the \
hell this module is for. East Asians, et al, you probably do. '(^_^)'. \
 \
For example, here's a valid MIME header you might get: \
 \
      Subject: =?EUC-KR?B?sNTAuLinKGxhemluZXNzKSwgwvzB9ri7seIoaW1w?= \
       =?EUC-KR?B?YXRpZW5jZSksILGzuLgoaHVicmlzKQ==?= \
 \
The fields basically decode to (sorry, I cannot approximate the non-Latin \
multibyte characters with any 7 bit sequences): \
 \
      Subject: ???(laziness), ????(impatience), ??(hubris)"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.014.3"

RPM_NAME = "perl-MIME-EncWords-1.014.3-1.28.noarch.rpm"
RPM_HASH = "23b18e14ac56cb5463a8ac7a6cbfbdd05ca8e19f5b475d6cf0cd34adc2a5d01c213de2d0c81b5b2d266e4b775c70c8269ba7fcb4fe29f69845d2943bccca62f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Encode--MIME--EncWords \
perl-MIME--EncWords \
perl-MIME-EncWords"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Encode \
perl-MIME--Base64 \
perl-MIME--Charset"

inherit rpm
