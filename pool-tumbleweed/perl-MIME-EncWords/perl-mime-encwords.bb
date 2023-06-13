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

RPM_NAME = "perl-MIME-EncWords-1.014.3-1.26.noarch.rpm"
RPM_HASH = "0349b5a007ea240cdb5c22ad462245af7a7c289d73a5aee96c2c94c3ffcde7652a3e50ef66a9de1557d8ecba81b833ad62345cd91370994894777c2b277c937c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Encode::MIME::EncWords) \
perl(MIME::EncWords) \
perl-MIME-EncWords"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Encode) \
perl(MIME::Base64) \
perl(MIME::Charset)"

inherit rpm
