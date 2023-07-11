SUMMARY = "Crypt::CBC compliant Rijndael encryption module"
DESCRIPTION = "This module implements the Rijndael cipher, which has just been selected as \
the Advanced Encryption Standard. \
 \
* keysize \
 \
Returns the keysize, which is 32 (bytes). The Rijndael cipher actually \
supports keylengths of 16, 24 or 32 bytes, but there is no way to \
communicate this to 'Crypt::CBC'. \
 \
* blocksize \
 \
The blocksize for Rijndael is 16 bytes (128 bits), although the algorithm \
actually supports any blocksize that is any multiple of our bytes. 128 \
bits, is however, the AES-specified block size, so this is all we support. \
 \
* $cipher = Crypt::Rijndael->new( $key [, $mode] ) \
 \
Create a new 'Crypt::Rijndael' cipher object with the given key (which must \
be 128, 192 or 256 bits long). The additional '$mode' argument is the \
encryption mode, either 'MODE_ECB' (electronic codebook mode, the default), \
'MODE_CBC' (cipher block chaining, the same that 'Crypt::CBC' does), \
'MODE_CFB' (128-bit cipher feedback), 'MODE_OFB' (128-bit output feedback), \
or 'MODE_CTR' (counter mode). \
 \
ECB mode is very insecure (read a book on cryptography if you don't know \
why!), so you should probably use CBC mode. \
 \
* $cipher->set_iv($iv) \
 \
This allows you to change the initial value vector used by the chaining \
modes. It is not relevant for ECB mode. \
 \
* $cipher->encrypt($data) \
 \
Encrypt data. The size of '$data' must be a multiple of 'blocksize' (16 \
bytes), otherwise this function will croak. Apart from that, it can be of \
(almost) any length. \
 \
* $cipher->decrypt($data) \
 \
Decrypts '$data'."
LICENSE = "LGPL-3.0-only"

PV = "1.16"

RPM_NAME = "perl-Crypt-Rijndael-1.16-1.13.aarch64.rpm"
RPM_HASH = "c11fd6b6cbace7cf302379f7f4eafa16b093869c14dea349db86365465f08a80d4c4aa3d07920379164342a35aa6e83dcaae695744d69de6aa3b56adf677ccab"

RPROVIDES:${PN} += "perl-Crypt--Rijndael \
perl-Crypt-Rijndael"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
