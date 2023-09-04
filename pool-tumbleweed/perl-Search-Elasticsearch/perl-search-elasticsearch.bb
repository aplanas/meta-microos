SUMMARY = "The official client for Elasticsearch"
DESCRIPTION = "Search::Elasticsearch is the official Perl client for Elasticsearch, \
supported by at http://elastic.co. Elasticsearch itself is a flexible and \
powerful open source, distributed real-time search and analytics engine for \
the cloud. You can read more about it on at http://www.elastic.co."
LICENSE = "Apache-2.0"

PV = "8.00"

RPM_NAME = "perl-Search-Elasticsearch-8.00-1.4.noarch.rpm"
RPM_HASH = "0d94ca706c1ba1f2e6afd712493af970a21de77ddfce1db5e41715b4d0c1a80b97231d87180e60aeaf01f62e692afd6588fac19c39dad93c894edf3d249a7bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Search--Elasticsearch \
perl-Search--Elasticsearch--Client--8-0 \
perl-Search--Elasticsearch--Client--8-0--Bulk \
perl-Search--Elasticsearch--Client--8-0--Direct \
perl-Search--Elasticsearch--Client--8-0--Direct--Autoscaling \
perl-Search--Elasticsearch--Client--8-0--Direct--CCR \
perl-Search--Elasticsearch--Client--8-0--Direct--Cat \
perl-Search--Elasticsearch--Client--8-0--Direct--Cluster \
perl-Search--Elasticsearch--Client--8-0--Direct--DanglingIndices \
perl-Search--Elasticsearch--Client--8-0--Direct--Enrich \
perl-Search--Elasticsearch--Client--8-0--Direct--Eql \
perl-Search--Elasticsearch--Client--8-0--Direct--Features \
perl-Search--Elasticsearch--Client--8-0--Direct--Fleet \
perl-Search--Elasticsearch--Client--8-0--Direct--Graph \
perl-Search--Elasticsearch--Client--8-0--Direct--ILM \
perl-Search--Elasticsearch--Client--8-0--Direct--Indices \
perl-Search--Elasticsearch--Client--8-0--Direct--Ingest \
perl-Search--Elasticsearch--Client--8-0--Direct--License \
perl-Search--Elasticsearch--Client--8-0--Direct--Logstash \
perl-Search--Elasticsearch--Client--8-0--Direct--ML \
perl-Search--Elasticsearch--Client--8-0--Direct--Migration \
perl-Search--Elasticsearch--Client--8-0--Direct--Monitoring \
perl-Search--Elasticsearch--Client--8-0--Direct--Nodes \
perl-Search--Elasticsearch--Client--8-0--Direct--Rollup \
perl-Search--Elasticsearch--Client--8-0--Direct--SQL \
perl-Search--Elasticsearch--Client--8-0--Direct--SSL \
perl-Search--Elasticsearch--Client--8-0--Direct--SearchableSnapshots \
perl-Search--Elasticsearch--Client--8-0--Direct--Security \
perl-Search--Elasticsearch--Client--8-0--Direct--Shutdown \
perl-Search--Elasticsearch--Client--8-0--Direct--Slm \
perl-Search--Elasticsearch--Client--8-0--Direct--Snapshot \
perl-Search--Elasticsearch--Client--8-0--Direct--Tasks \
perl-Search--Elasticsearch--Client--8-0--Direct--Transform \
perl-Search--Elasticsearch--Client--8-0--Direct--Watcher \
perl-Search--Elasticsearch--Client--8-0--Direct--XPack \
perl-Search--Elasticsearch--Client--8-0--Role--API \
perl-Search--Elasticsearch--Client--8-0--Role--Bulk \
perl-Search--Elasticsearch--Client--8-0--Role--Scroll \
perl-Search--Elasticsearch--Client--8-0--Scroll \
perl-Search--Elasticsearch--Client--8-0--TestServer \
perl-Search--Elasticsearch--Cxn--Factory \
perl-Search--Elasticsearch--Cxn--HTTPTiny \
perl-Search--Elasticsearch--Cxn--LWP \
perl-Search--Elasticsearch--CxnPool--Sniff \
perl-Search--Elasticsearch--CxnPool--Static \
perl-Search--Elasticsearch--CxnPool--Static--NoPing \
perl-Search--Elasticsearch--Error \
perl-Search--Elasticsearch--Logger--LogAny \
perl-Search--Elasticsearch--Role--API \
perl-Search--Elasticsearch--Role--Client \
perl-Search--Elasticsearch--Role--Client--Direct \
perl-Search--Elasticsearch--Role--Cxn \
perl-Search--Elasticsearch--Role--CxnPool \
perl-Search--Elasticsearch--Role--CxnPool--Sniff \
perl-Search--Elasticsearch--Role--CxnPool--Static \
perl-Search--Elasticsearch--Role--CxnPool--Static--NoPing \
perl-Search--Elasticsearch--Role--Is-Sync \
perl-Search--Elasticsearch--Role--Logger \
perl-Search--Elasticsearch--Role--Serializer \
perl-Search--Elasticsearch--Role--Serializer--JSON \
perl-Search--Elasticsearch--Role--Transport \
perl-Search--Elasticsearch--Serializer--JSON \
perl-Search--Elasticsearch--Serializer--JSON--Cpanel \
perl-Search--Elasticsearch--Serializer--JSON--PP \
perl-Search--Elasticsearch--Serializer--JSON--XS \
perl-Search--Elasticsearch--TestServer \
perl-Search--Elasticsearch--Transport \
perl-Search--Elasticsearch--Util \
perl-Search-Elasticsearch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Any--URI--Escape \
perl-Devel--GlobalDestruction \
perl-HTTP--Headers \
perl-HTTP--Request \
perl-HTTP--Tiny \
perl-IO--Compress--Deflate \
perl-IO--Compress--Gzip \
perl-IO--Uncompress--Gunzip \
perl-IO--Uncompress--Inflate \
perl-JSON--MaybeXS \
perl-JSON--PP \
perl-LWP--UserAgent \
perl-Log--Any \
perl-Log--Any--Adapter \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Net--IP \
perl-Package--Stash \
perl-Sub--Exporter \
perl-Try--Tiny \
perl-URI \
perl-namespace--clean"

inherit rpm
