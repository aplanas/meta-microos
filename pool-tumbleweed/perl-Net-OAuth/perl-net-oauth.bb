SUMMARY = "OAuth 1.0 for Perl"
DESCRIPTION = "OAuth 1.0 for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.28"

RPM_NAME = "perl-Net-OAuth-0.28-5.27.noarch.rpm"
RPM_HASH = "2184aa5b405e118b79f65b4a83144321381390dffd2e08432a142fc0a2a4db39035bc1505cf02fe0c1a307a4e564e38af480019176ee6b850beff2d1e70c3666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OAuth \
perl-Net--OAuth--AccessToken \
perl-Net--OAuth--AccessTokenRequest \
perl-Net--OAuth--AccessTokenResponse \
perl-Net--OAuth--Client \
perl-Net--OAuth--ConsumerRequest \
perl-Net--OAuth--Message \
perl-Net--OAuth--ProtectedResourceRequest \
perl-Net--OAuth--Request \
perl-Net--OAuth--RequestTokenRequest \
perl-Net--OAuth--RequestTokenResponse \
perl-Net--OAuth--Response \
perl-Net--OAuth--SignatureMethod--HMAC-SHA1 \
perl-Net--OAuth--SignatureMethod--HMAC-SHA256 \
perl-Net--OAuth--SignatureMethod--PLAINTEXT \
perl-Net--OAuth--SignatureMethod--RSA-SHA1 \
perl-Net--OAuth--UserAuthRequest \
perl-Net--OAuth--UserAuthResponse \
perl-Net--OAuth--V1-0A--AccessTokenRequest \
perl-Net--OAuth--V1-0A--RequestTokenRequest \
perl-Net--OAuth--V1-0A--RequestTokenResponse \
perl-Net--OAuth--V1-0A--UserAuthResponse \
perl-Net--OAuth--XauthAccessTokenRequest \
perl-Net--OAuth--YahooAccessTokenRefreshRequest \
perl-Net-OAuth"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-Digest--HMAC-SHA1 \
perl-Digest--SHA \
perl-Digest--SHA1 \
perl-Encode \
perl-LWP--UserAgent \
perl-URI--Escape"

inherit rpm
