SUMMARY = "Perl files for LaTeXML"
DESCRIPTION = "Perl files for LaTeXML"
LICENSE = "SUSE-Public-Domain"

PV = "0.8.7"

RPM_NAME = "perl-LaTeXML-0.8.7-1.4.noarch.rpm"
RPM_HASH = "8675a959b882d09233dbafba4956845f9a5a7347d648e28fea8db0f662a1a370e40bdd6691701e1fc5519978e1cedcf398cb77e0d69e30c4fa0e7feb8657e1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LaTeXML \
perl-LaTeXML--Common--Color \
perl-LaTeXML--Common--Color--Derived \
perl-LaTeXML--Common--Color--cmy \
perl-LaTeXML--Common--Color--cmyk \
perl-LaTeXML--Common--Color--gray \
perl-LaTeXML--Common--Color--hsb \
perl-LaTeXML--Common--Color--rgb \
perl-LaTeXML--Common--Config \
perl-LaTeXML--Common--Dimension \
perl-LaTeXML--Common--Error \
perl-LaTeXML--Common--Float \
perl-LaTeXML--Common--Font \
perl-LaTeXML--Common--Font--Metric \
perl-LaTeXML--Common--Font--StandardMetrics \
perl-LaTeXML--Common--Glue \
perl-LaTeXML--Common--Locator \
perl-LaTeXML--Common--Model \
perl-LaTeXML--Common--Model--DTD \
perl-LaTeXML--Common--Model--RelaxNG \
perl-LaTeXML--Common--Number \
perl-LaTeXML--Common--Object \
perl-LaTeXML--Common--XML \
perl-LaTeXML--Common--XML--Parser \
perl-LaTeXML--Common--XML--RelaxNG \
perl-LaTeXML--Common--XML--XPath \
perl-LaTeXML--Common--XML--XSLT \
perl-LaTeXML--Core \
perl-LaTeXML--Core--Alignment \
perl-LaTeXML--Core--Alignment--Template \
perl-LaTeXML--Core--Array \
perl-LaTeXML--Core--Box \
perl-LaTeXML--Core--Comment \
perl-LaTeXML--Core--Definition \
perl-LaTeXML--Core--Definition--CharDef \
perl-LaTeXML--Core--Definition--Conditional \
perl-LaTeXML--Core--Definition--Constructor \
perl-LaTeXML--Core--Definition--Constructor--Compiler \
perl-LaTeXML--Core--Definition--Expandable \
perl-LaTeXML--Core--Definition--Primitive \
perl-LaTeXML--Core--Definition--Register \
perl-LaTeXML--Core--Document \
perl-LaTeXML--Core--Gullet \
perl-LaTeXML--Core--KeyVal \
perl-LaTeXML--Core--KeyVals \
perl-LaTeXML--Core--List \
perl-LaTeXML--Core--Mouth \
perl-LaTeXML--Core--Mouth--Binding \
perl-LaTeXML--Core--Mouth--file \
perl-LaTeXML--Core--Mouth--http \
perl-LaTeXML--Core--Mouth--https \
perl-LaTeXML--Core--MuDimension \
perl-LaTeXML--Core--MuGlue \
perl-LaTeXML--Core--Pair \
perl-LaTeXML--Core--PairList \
perl-LaTeXML--Core--Parameter \
perl-LaTeXML--Core--Parameters \
perl-LaTeXML--Core--Rewrite \
perl-LaTeXML--Core--State \
perl-LaTeXML--Core--Stomach \
perl-LaTeXML--Core--Token \
perl-LaTeXML--Core--Tokens \
perl-LaTeXML--Core--Whatsit \
perl-LaTeXML--Global \
perl-LaTeXML--MathGrammar \
perl-LaTeXML--MathParser \
perl-LaTeXML--Package \
perl-LaTeXML--Post \
perl-LaTeXML--Post--Collector \
perl-LaTeXML--Post--CrossRef \
perl-LaTeXML--Post--Document \
perl-LaTeXML--Post--DumbCollator \
perl-LaTeXML--Post--Graphics \
perl-LaTeXML--Post--LaTeXImages \
perl-LaTeXML--Post--LexMath \
perl-LaTeXML--Post--MakeBibliography \
perl-LaTeXML--Post--MakeIndex \
perl-LaTeXML--Post--Manifest \
perl-LaTeXML--Post--Manifest--Epub \
perl-LaTeXML--Post--MathImages \
perl-LaTeXML--Post--MathML \
perl-LaTeXML--Post--MathML--Content \
perl-LaTeXML--Post--MathML--Linebreaker \
perl-LaTeXML--Post--MathML--OperatorDictionary \
perl-LaTeXML--Post--MathML--Presentation \
perl-LaTeXML--Post--MathProcessor \
perl-LaTeXML--Post--OpenMath \
perl-LaTeXML--Post--PictureImages \
perl-LaTeXML--Post--Processor \
perl-LaTeXML--Post--SVG \
perl-LaTeXML--Post--Scan \
perl-LaTeXML--Post--Split \
perl-LaTeXML--Post--TeXMath \
perl-LaTeXML--Post--UnicodeMath \
perl-LaTeXML--Post--Writer \
perl-LaTeXML--Post--XMath \
perl-LaTeXML--Post--XSLT \
perl-LaTeXML--Pre--BibTeX \
perl-LaTeXML--Pre--BibTeX--Entry \
perl-LaTeXML--Util--Geometry \
perl-LaTeXML--Util--Image \
perl-LaTeXML--Util--ObjectDB \
perl-LaTeXML--Util--ObjectDB--Entry \
perl-LaTeXML--Util--Pack \
perl-LaTeXML--Util--Pathname \
perl-LaTeXML--Util--Radix \
perl-LaTeXML--Util--Test \
perl-LaTeXML--Util--Transform \
perl-LaTeXML--Util--Unicode \
perl-LaTeXML--Util--WWW \
perl-LaTeXML--Version \
perl-Parse--RecDescent--LaTeXML--MathGrammar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Zip \
perl-DB-File \
perl-File--Which \
perl-Getopt--Long \
perl-IO--String \
perl-Image--Size \
perl-JSON--XS \
perl-LWP--Protocol--https \
perl-Parse--RecDescent \
perl-Pod--Find \
perl-Test--Simple \
perl-Text--Unidecode \
perl-Time--HiRes \
perl-URI \
perl-UUID--Tiny \
perl-XML--LibXML \
perl-XML--LibXSLT"

inherit rpm
