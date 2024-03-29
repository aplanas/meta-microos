SUMMARY = "GPG Tools"
DESCRIPTION = "Signing Party is a collection for all kinds of pgp related things, \
including signing scripts, party preparation scripts etc. \
 \
caff is a script that helps you in keysigning. It takes a list of \
keyids on the command line, fetches them from a keyserver and calls \
GnuPG so that you can sign it. It then mails each key to all its email \
addresses - only including the one UID that we send to in each mail. \
 \
pgp-clean takes a list of keyids on the command line and outputs an \
ascii-armored keyring on stdout for each key with all signatures \
except self-signatures stripped. Its use is to reduce the size of keys \
sent out after signing. (pgp-clean is a stripped-down caff version.) \
 \
gpg-key2ps will output a PostScript file which has your Key-ID, UIDs \
and fingerprint nicely formatted for printing paper slips to take with \
you to a signing-party. \
 \
Given one or more key-ids, gpg-mailkeys mails these keys to their \
owners. You use this after you've signed them. By default, the mails \
contain a standard text and your name and address as the From (as \
determined by the sendmail command). \
 \
gpglist takes a keyid and creates a listing showing who signed your \
user IDs. \
 \
gpgsigs was written to assist the user in signing keys during a \
keysigning party. It takes as input a file containing keys in gpg \
--list-keys format and prepends every line with a tag indicating if \
the user has already signed that uid. \
 \
keylookup is a wrapper around gpg --search, allowing you to search for \
keys on a keyserver. It presents the list of matching keys to the user \
and allows her to select the keys for importing into the GnuPG \
keyring."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "signing-party-2.11-1.9.aarch64.rpm"
RPM_HASH = "bb1aaa45130f8c9981837bc2304eb7836f5c4b8e976137d4343afbb62dccc5a6ed32002e4a7287dd7d1507fff3c5163fd6345417be7419e77f4268c4048b9b24"

RPROVIDES:${PN} += "signing-party"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
/usr/sbin/sendmail \
gpg \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmd.so.0 \
perl \
perl-GnuPG-Interface \
perl-MIME-tools \
perl-MailTools \
perl-Net-IDN-Encode \
perl-Text-Template \
qprint"

inherit rpm
