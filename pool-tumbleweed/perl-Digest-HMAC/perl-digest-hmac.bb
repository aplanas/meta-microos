SUMMARY = "Keyed-Hashing for Message Authentication"
DESCRIPTION = "HMAC is used for message integrity checks between two parties that share a \
secret key, and works in combination with some other Digest algorithm, \
usually MD5 or SHA-1. The HMAC mechanism is described in RFC 2104. \
 \
HMAC follow the common 'Digest::' interface, but the constructor takes the \
secret key and the name of some other simple 'Digest::' as argument. \
 \
The hmac() and hmac_hex() functions and the Digest::HMAC->new() constructor \
takes an optional $blocksize argument as well. The HMAC algorithm assumes \
the digester to hash by iterating a basic compression function on blocks of \
data and the $blocksize should match the byte-length of such blocks. \
 \
The default $blocksize is 64 which is suitable for the MD5 and SHA-1 digest \
functions. For stronger algorithms the blocksize probably needs to be \
increased."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.04"

RPM_NAME = "perl-Digest-HMAC-1.04-1.12.noarch.rpm"
RPM_HASH = "fe1cee2b63f192876893f287842000fad05b329189fc611aeb8624d564a910579ac29cdc366fdc1cc98fb9eed9f310e1d2aeba5d4a1ab55d2527a59d6f3534cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Digest--HMAC \
perl-Digest--HMAC-MD5 \
perl-Digest--HMAC-SHA1 \
perl-Digest-HMAC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest--SHA"

inherit rpm
