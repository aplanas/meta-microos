SUMMARY = "OAuth 1.0 for Perl"
DESCRIPTION = "OAuth 1.0 for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.28"

RPM_NAME = "perl-Net-OAuth-0.28-5.26.noarch.rpm"
RPM_HASH = "1a8d8c627b770a76a01b4bd46c8baa4d17e903f1d1c388247c4b8f17f22431d40762be038db50507cc2f867c7c35906c95d34433f04bc55cbad2cc213eb59a85"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-Digest--HMAC-SHA1 \
perl-Digest--SHA \
perl-Digest--SHA1 \
perl-Encode \
perl-LWP--UserAgent \
perl-URI--Escape"

inherit rpm
