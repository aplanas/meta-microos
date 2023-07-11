SUMMARY = "Perl Modules For Using Spamassassin Within An Own Perl Script"
DESCRIPTION = "This package contains the perl modules for the spamassassin, including \
the filter rules. This package is required for the package \
'spamassassin', the commandline tool."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "perl-Mail-SpamAssassin-4.0.0-74.5.noarch.rpm"
RPM_HASH = "924c4866f800be328949a5f3909c5b3a3af898eac466eb7bb5fcdb16a3ee087e433bfe25bce54d9e9e9078d662f7434afb8237f8048ef98d56109c7a55531eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-Mail-SpamAssassin \
perl-Mail--SpamAssassin \
perl-Mail--SpamAssassin--AICache \
perl-Mail--SpamAssassin--ArchiveIterator \
perl-Mail--SpamAssassin--AsyncLoop \
perl-Mail--SpamAssassin--AutoWelcomelist \
perl-Mail--SpamAssassin--Bayes \
perl-Mail--SpamAssassin--Bayes--Combine \
perl-Mail--SpamAssassin--Bayes--CombineChi \
perl-Mail--SpamAssassin--Bayes--CombineNaiveBayes \
perl-Mail--SpamAssassin--BayesStore \
perl-Mail--SpamAssassin--BayesStore--BDB \
perl-Mail--SpamAssassin--BayesStore--DBM \
perl-Mail--SpamAssassin--BayesStore--MySQL \
perl-Mail--SpamAssassin--BayesStore--PgSQL \
perl-Mail--SpamAssassin--BayesStore--Redis \
perl-Mail--SpamAssassin--BayesStore--SDBM \
perl-Mail--SpamAssassin--BayesStore--SQL \
perl-Mail--SpamAssassin--Client \
perl-Mail--SpamAssassin--Conf \
perl-Mail--SpamAssassin--Conf--LDAP \
perl-Mail--SpamAssassin--Conf--Parser \
perl-Mail--SpamAssassin--Conf--SQL \
perl-Mail--SpamAssassin--Constants \
perl-Mail--SpamAssassin--DBBasedAddrList \
perl-Mail--SpamAssassin--Dns \
perl-Mail--SpamAssassin--DnsResolver \
perl-Mail--SpamAssassin--GeoDB \
perl-Mail--SpamAssassin--HTML \
perl-Mail--SpamAssassin--Locales \
perl-Mail--SpamAssassin--Locker \
perl-Mail--SpamAssassin--Locker--Flock \
perl-Mail--SpamAssassin--Locker--UnixNFSSafe \
perl-Mail--SpamAssassin--Locker--Win32 \
perl-Mail--SpamAssassin--Logger \
perl-Mail--SpamAssassin--Logger--File \
perl-Mail--SpamAssassin--Logger--Stderr \
perl-Mail--SpamAssassin--Logger--Syslog \
perl-Mail--SpamAssassin--MailingList \
perl-Mail--SpamAssassin--Message \
perl-Mail--SpamAssassin--Message--Metadata \
perl-Mail--SpamAssassin--Message--Metadata--Received \
perl-Mail--SpamAssassin--Message--Node \
perl-Mail--SpamAssassin--NetSet \
perl-Mail--SpamAssassin--PerMsgLearner \
perl-Mail--SpamAssassin--PerMsgStatus \
perl-Mail--SpamAssassin--PersistentAddrList \
perl-Mail--SpamAssassin--Plugin \
perl-Mail--SpamAssassin--Plugin--ASN \
perl-Mail--SpamAssassin--Plugin--AWL \
perl-Mail--SpamAssassin--Plugin--AccessDB \
perl-Mail--SpamAssassin--Plugin--AntiVirus \
perl-Mail--SpamAssassin--Plugin--AskDNS \
perl-Mail--SpamAssassin--Plugin--AuthRes \
perl-Mail--SpamAssassin--Plugin--AutoLearnThreshold \
perl-Mail--SpamAssassin--Plugin--Bayes \
perl-Mail--SpamAssassin--Plugin--BodyEval \
perl-Mail--SpamAssassin--Plugin--BodyRuleBaseExtractor \
perl-Mail--SpamAssassin--Plugin--Check \
perl-Mail--SpamAssassin--Plugin--DCC \
perl-Mail--SpamAssassin--Plugin--DKIM \
perl-Mail--SpamAssassin--Plugin--DMARC \
perl-Mail--SpamAssassin--Plugin--DNSEval \
perl-Mail--SpamAssassin--Plugin--DecodeShortURLs \
perl-Mail--SpamAssassin--Plugin--ExtractText \
perl-Mail--SpamAssassin--Plugin--FreeMail \
perl-Mail--SpamAssassin--Plugin--FromNameSpoof \
perl-Mail--SpamAssassin--Plugin--HTMLEval \
perl-Mail--SpamAssassin--Plugin--HTTPSMismatch \
perl-Mail--SpamAssassin--Plugin--HashBL \
perl-Mail--SpamAssassin--Plugin--HeaderEval \
perl-Mail--SpamAssassin--Plugin--ImageInfo \
perl-Mail--SpamAssassin--Plugin--MIMEEval \
perl-Mail--SpamAssassin--Plugin--MIMEHeader \
perl-Mail--SpamAssassin--Plugin--OLEVBMacro \
perl-Mail--SpamAssassin--Plugin--OneLineBodyRuleType \
perl-Mail--SpamAssassin--Plugin--PDFInfo \
perl-Mail--SpamAssassin--Plugin--PhishTag \
perl-Mail--SpamAssassin--Plugin--Phishing \
perl-Mail--SpamAssassin--Plugin--Pyzor \
perl-Mail--SpamAssassin--Plugin--Razor2 \
perl-Mail--SpamAssassin--Plugin--RelayCountry \
perl-Mail--SpamAssassin--Plugin--RelayEval \
perl-Mail--SpamAssassin--Plugin--ReplaceTags \
perl-Mail--SpamAssassin--Plugin--ResourceLimits \
perl-Mail--SpamAssassin--Plugin--Reuse \
perl-Mail--SpamAssassin--Plugin--Rule2XSBody \
perl-Mail--SpamAssassin--Plugin--SPF \
perl-Mail--SpamAssassin--Plugin--Shortcircuit \
perl-Mail--SpamAssassin--Plugin--SpamCop \
perl-Mail--SpamAssassin--Plugin--Test \
perl-Mail--SpamAssassin--Plugin--TextCat \
perl-Mail--SpamAssassin--Plugin--TxRep \
perl-Mail--SpamAssassin--Plugin--URIDNSBL \
perl-Mail--SpamAssassin--Plugin--URIDetail \
perl-Mail--SpamAssassin--Plugin--URIEval \
perl-Mail--SpamAssassin--Plugin--URILocalBL \
perl-Mail--SpamAssassin--Plugin--VBounce \
perl-Mail--SpamAssassin--Plugin--WLBLEval \
perl-Mail--SpamAssassin--Plugin--WelcomeListSubject \
perl-Mail--SpamAssassin--PluginHandler \
perl-Mail--SpamAssassin--RegistryBoundaries \
perl-Mail--SpamAssassin--Reporter \
perl-Mail--SpamAssassin--SQLBasedAddrList \
perl-Mail--SpamAssassin--SpamdForkScaling \
perl-Mail--SpamAssassin--SubProcBackChannel \
perl-Mail--SpamAssassin--Timeout \
perl-Mail--SpamAssassin--Util \
perl-Mail--SpamAssassin--Util--DependencyInfo \
perl-Mail--SpamAssassin--Util--Progress \
perl-Mail--SpamAssassin--Util--ScopedTimer \
perl-Mail--SpamAssassin--Util--TieOneStringHash \
perl-Mail--SpamAssassin--Util--TinyRedis \
perl-Mail-SpamAssassin \
perl-spamassassin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Zip \
perl-Digest--SHA1 \
perl-Errno \
perl-File--Copy \
perl-File--Spec \
perl-HTML--Parser \
perl-Mail--DKIM \
perl-Net--DNS \
perl-NetAddr--IP \
perl-Pod--Usage \
perl-Sys--Hostname \
perl-Time--HiRes \
perl-Time--Local"

inherit rpm
