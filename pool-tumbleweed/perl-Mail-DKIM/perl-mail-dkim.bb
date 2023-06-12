SUMMARY = "Signs/verifies Internet mail with DKIM/DomainKey signatures"
DESCRIPTION = "This module implements the various components of the DKIM and DomainKeys \
message-signing and verifying standards for Internet mail. It currently \
tries to implement these specifications: \
 \
* RFC4871, for DKIM \
 \
* RFC4870, for DomainKeys \
 \
* draft-ietf-dmarc-arc-protocol-06, for ARC \
 \
The module uses an object-oriented interface. You use one of two different \
classes, depending on whether you are signing or verifying a message. To \
sign, use the Mail::DKIM::Signer class. To verify, use the \
Mail::DKIM::Verifier class. Simple, eh? \
 \
Likewise for ARC, use the ARC modules Mail::DKIM::ARC::Signer and \
Mail::DKIM::ARC::Verifier \
 \
If you're sending to test libraries which expect the tags in headers to be \
sorted, you can set $Mail::DKIM::SORTTAGS to a true value, and all created \
headers will get sorted keys"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230212"

RPM_NAME = "perl-Mail-DKIM-1.20230212-1.1.noarch.rpm"
RPM_HASH = "536d170e57b5ea6b4d2657b4d8ca794ff1398c80bfe9cb8f1718b5100a2e86fc95fa3b655183b1a5b141a2305f338a95edb3ff432288ae43977e066ec2c98498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mail::DKIM) \
perl(Mail::DKIM::ARC::MessageSignature) \
perl(Mail::DKIM::ARC::Seal) \
perl(Mail::DKIM::ARC::Signer) \
perl(Mail::DKIM::ARC::Verifier) \
perl(Mail::DKIM::Algorithm::Base) \
perl(Mail::DKIM::Algorithm::dk_rsa_sha1) \
perl(Mail::DKIM::Algorithm::rsa_sha1) \
perl(Mail::DKIM::Algorithm::rsa_sha256) \
perl(Mail::DKIM::AuthorDomainPolicy) \
perl(Mail::DKIM::Canonicalization::Base) \
perl(Mail::DKIM::Canonicalization::DkCommon) \
perl(Mail::DKIM::Canonicalization::DkimCommon) \
perl(Mail::DKIM::Canonicalization::dk_nofws) \
perl(Mail::DKIM::Canonicalization::dk_simple) \
perl(Mail::DKIM::Canonicalization::nowsp) \
perl(Mail::DKIM::Canonicalization::relaxed) \
perl(Mail::DKIM::Canonicalization::seal) \
perl(Mail::DKIM::Canonicalization::simple) \
perl(Mail::DKIM::Common) \
perl(Mail::DKIM::DNS) \
perl(Mail::DKIM::DkPolicy) \
perl(Mail::DKIM::DkSignature) \
perl(Mail::DKIM::DkimPolicy) \
perl(Mail::DKIM::Key) \
perl(Mail::DKIM::KeyValueList) \
perl(Mail::DKIM::MessageParser) \
perl(Mail::DKIM::Policy) \
perl(Mail::DKIM::PrivateKey) \
perl(Mail::DKIM::PublicKey) \
perl(Mail::DKIM::Signature) \
perl(Mail::DKIM::Signer) \
perl(Mail::DKIM::SignerPolicy) \
perl(Mail::DKIM::TextWrap) \
perl(Mail::DKIM::Verifier) \
perl-Mail-DKIM"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Crypt::OpenSSL::RSA) \
perl(Digest::SHA) \
perl(Mail::Address) \
perl(Mail::AuthenticationResults::Header::AuthServID) \
perl(Mail::AuthenticationResults::Parser) \
perl(Net::DNS)"

inherit rpm