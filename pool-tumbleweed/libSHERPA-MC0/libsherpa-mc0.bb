SUMMARY = "MC event generator for Simulation of High-Energy Reactions of PArticles"
DESCRIPTION = "Sherpa is a Monte Carlo event generator for the Simulation of \
High-Energy Reactions of PArticles in lepton-lepton, lepton-photon, \
photon-photon, lepton-hadron and hadron-hadron collisions. It provides \
complete hadronic final states in simulations of high-energy particle \
collisions. The produced events may be passed into detector \
simulations used by the various experiments. The entire code has been \
written in C++. \
 \
This package provides the shared libraries for Sherpa."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "libSHERPA-MC0-2.2.12-2.12.aarch64.rpm"
RPM_HASH = "e52338500381b4c5dd81726f62a9b28f7135ba65b264a692684bf2f71129a420a602b0488593b9285d430bd5bc5b6024fb6418f88b4d414ab2366c03d4d0d848"

RPROVIDES:${PN} += "libAhadicDecays.so.0 \
libAhadicFormation.so.0 \
libAhadicMain.so.0 \
libAhadicTools.so.0 \
libAmegic.so.0 \
libAmegicCluster.so.0 \
libAmegicPSGen.so.0 \
libAmisic.so.0 \
libAmisicModel.so.0 \
libAmisicTools.so.0 \
libAmplitude.so.0 \
libBeam.so.0 \
libCSCalculators.so.0 \
libCSMain.so.0 \
libCSShowers.so.0 \
libCSTools.so.0 \
libCT10Sherpa.so.0 \
libCT12Sherpa.so.0 \
libCTEQ6Sherpa.so.0 \
libComix.so.0 \
libComixAmplitude.so.0 \
libComixCluster.so.0 \
libComixPhasespace.so.0 \
libDipoleSubtraction.so.0 \
libDireGauge.so.0 \
libDireLorentz.so.0 \
libDireMain.so.0 \
libDireShower.so.0 \
libDireTools.so.0 \
libExtraXS.so.0 \
libExtraXS1-2.so.0 \
libExtraXS1-3.so.0 \
libExtraXS2-2.so.0 \
libExtraXSCluster.so.0 \
libExtraXSNLO.so.0 \
libGRVSherpa.so.0 \
libHadronsCurrents.so.0 \
libHadronsMEs.so.0 \
libHadronsMain.so.0 \
libHadronsPSs.so.0 \
libLHAPDFSherpa.so.0 \
libLundTools.so.0 \
libMCatNLOCalculators.so.0 \
libMCatNLOMain.so.0 \
libMCatNLOShowers.so.0 \
libMCatNLOTools.so.0 \
libMEProcess.so.0 \
libMEToolsColors.so.0 \
libMEToolsCurrents.so.0 \
libMEToolsExplicit.so.0 \
libMEToolsLoops.so.0 \
libMEToolsMain.so.0 \
libMEToolsSpinCorrelations.so.0 \
libMEToolsVertices.so.0 \
libMRST01LOSherpa.so.0 \
libMRST04QEDSherpa.so.0 \
libMRST99Sherpa.so.0 \
libMSTW08Sherpa.so.0 \
libModelMain.so.0 \
libModelUFO.so.0 \
libNNPDFSherpa.so.0 \
libPDF.so.0 \
libPDFESherpa.so.0 \
libPhasicChannels.so.0 \
libPhasicDecays.so.0 \
libPhasicEnhance.so.0 \
libPhasicMain.so.0 \
libPhasicProcess.so.0 \
libPhasicScales.so.0 \
libPhasicSelectors.so.0 \
libPhotonsMEs.so.0 \
libPhotonsMain.so.0 \
libPhotonsPhaseSpace.so.0 \
libPhotonsTools.so.0 \
libRemnant.so.0 \
libSHERPA-MC \
libSHERPA-MC0 \
libSherpaAnalyses.so.0 \
libSherpaAnalysis.so.0 \
libSherpaAnalysisTools.so.0 \
libSherpaAnalysisTrigger.so.0 \
libSherpaFusing.so.0 \
libSherpaHEFT.so.0 \
libSherpaHepMC3Output.so.0 \
libSherpaHiggs.so.0 \
libSherpaInitialization.so.0 \
libSherpaMain.so.0 \
libSherpaObservables.so.0 \
libSherpaPerturbativePhysics.so.0 \
libSherpaPythia.so.0 \
libSherpaRivetAnalysis.so.0 \
libSherpaSM.so.0 \
libSherpaSingleEvents.so.0 \
libSherpaSoftPhysics.so.0 \
libSherpaTauPi.so.0 \
libSherpaTools.so.0 \
libShrimpsBeamRemnants.so.0 \
libShrimpsEikonals.so.0 \
libShrimpsEvents.so.0 \
libShrimpsMain.so.0 \
libShrimpsTools.so.0 \
libShrimpsXsecs.so.0 \
libString.so.0 \
libToolsMath.so.0 \
libToolsOrg.so.0 \
libToolsPhys.so.0 \
libZfunctions.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libHepMC3search.so.4 \
libLHAPDF-6.5.4.so \
libRivet-3.1.7.so \
libSHERPA-MC-config \
libYODA-1.9.7.so \
libc.so.6 \
libfastjet.so.0 \
libfastjetcontribfragile.so \
libfastjetplugins.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgmp.so.10 \
libm.so.6 \
libsiscone-spherical.so.0 \
libsiscone.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
